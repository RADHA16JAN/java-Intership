package SyntheticsGPTKQL;
import java.util.List;
public class KQLMetadataManager extends MetadataManager {

    String kustoClusterURL;
    //TODO: Connect to kusto Cluster
    String json ;

    public String getObjectMetadata(String objectName) {


        return objectName;
    }

    public static void main(String[] args) {
        
        String objectName;
        getObjectMetadata();
    }

    private static void getObjectMetadata() {
    }

    @Override
    public List<String> getObjectMetadata(List<String> objectName) {
        return null;
    }
}

