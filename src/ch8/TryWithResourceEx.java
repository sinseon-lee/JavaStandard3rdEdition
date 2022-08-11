package ch8;

public class TryWithResourceEx {

    public static void main(String[] args) {

        try (CloseableResource closeableResource = new CloseableResource()) {
                closeableResource.exceptionWork(false);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource closeableResource = new CloseableResource()) {
            closeableResource.exceptionWork(true);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
    }

}

class CloseableResource implements AutoCloseable {

    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("WorkException(" + exception + ")가 호출됨");

        if (exception) {
            throw new WorkException("Work Exception 발생!");
        }
    }

    @Override
    public void close() throws CloseException {
        System.out.println("close()가 호출됨");
        throw new CloseException("CloseException 발생!");
    }
}

class WorkException extends Exception {
    WorkException(String msg) {
        super(msg);
    }
}

class CloseException extends Exception {
    CloseException(String msg) {
        super(msg);
    }
}