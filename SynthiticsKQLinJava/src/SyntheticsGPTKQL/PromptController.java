package SyntheticsGPTKQL;

import java.util.Collections;

public class PromptController {
    public PromptController(){
        NLPProvider nlpClient;
        MetadataManager kqlMetadataManager;
        PromptBuilder promptBuilder;

        nlpClient = NLPAdapter.getNLPClient();
        kqlMetadataManager = DomainAdapter.getMetadataManager(); ;
        promptBuilder = PromptAdapter.getPromptBuilder();

    }

    public static String buildPrompts(String userPrompt){

        String tableSchema;
        String tableNames;
        String prompts;

        NLPProvider nlpClient = null;
        MetadataManager kqlMetadataManager = null;
        PromptBuilder promptBuilder = null;

        tableNames = nlpClient.getEntities(userPrompt).toString();
        tableSchema = kqlMetadataManager.getObjectMetadata(Collections.singletonList(tableNames)).toString();
        prompts = promptBuilder.buildPrompts(Collections.singletonList(tableSchema),userPrompt).toString();


        return tableSchema;
    }

    public static void main(String[] args) {




    }
}
