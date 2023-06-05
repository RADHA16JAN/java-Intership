package SyntheticsGPTKQL;

public class DomainAdapter {
    public static MetadataManager getMetadataManager() {
        MetadataManager metadataManager = new KQLMetadataManager();
        return metadataManager;
    }
    public static void main(String[] args) {
    getMetadataManager();
    }
}
