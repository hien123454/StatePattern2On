package entityDocument;

public class DocumentApp    {
    public static void main(String[] args) {
        DocumentService service = new DocumentService();

        service.setState(DocumentState.NEW);
        service.handleRequest();

        service.setState(DocumentState.SUBMITTED);
        service.handleRequest();

        service.setState(DocumentState.APPROVED);
        service.handleRequest();
    }
}
