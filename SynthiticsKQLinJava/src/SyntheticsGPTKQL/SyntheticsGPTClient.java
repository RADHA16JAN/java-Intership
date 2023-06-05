package SyntheticsGPTKQL;

import java.util.Collections;

public class SyntheticsGPTClient {
    public static void getKQLOutput(){
        NLPProvider nlpClient;
        MetadataManager kqlMetadataManager;
        LLMClient gptClient;

        String prompts;
        String model="";

        PromptController promptController = new PromptController();

        prompts = promptController.buildPrompts("From tables TestRunDetails and Resources generate KQL Query to retrieve only last 10 resource names that ran 'Sybase' tests based on datetime");

        gptClient = LLMApater.getLLMInstance();

        gptClient.setProperties();

        gptClient.invokeLLMCommandAsync(Collections.singletonList(prompts),model);

    }


    public static void main(String[] args) {
     //   getKQLOutput();



    }
}
