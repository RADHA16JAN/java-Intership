package SyntheticsGPTKQL;

import java.util.List;

public class NLPAdapter {



    public static NLPProvider getNLPClient() {
        NLPProvider nlpClient = new NLPProvider() {
            @Override
            public List<String> getEntities(String userPrompt) {
                return null;
            }

            @Override
            public List<String> getIntents(String userPrompt) {
                return null;
            }
        };
        return nlpClient;
    }

    public static void main(String[] args) {

    }
}
