package SyntheticsGPTKQL;

public class LLMApater {
    public static LLMClient getLLMInstance()
    {
        LLMClient llmClient = new GPTClient();
        return llmClient;
    }

    public static void main(String[] args) {

    }
}
