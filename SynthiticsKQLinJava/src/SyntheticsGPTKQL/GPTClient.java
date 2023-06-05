package SyntheticsGPTKQL;
import javax.annotation.processing.Completions;
import java.lang.*;
import java.util.*;

public class GPTClient extends LLMClient{

    private GPTClient oaiClient;

    public  void GetCompletionsAsync(List<String> prompts) {
    }

    public  void invokeLLMCommandAsync(List<String> prompts, String model)
    {
        this.GetCompletionsAsync(prompts);
    }

    public static void main(String[] args) {
        GPTClient gpt=new GPTClient();
       // gpt.GetCompletionsAsync();
    }
}
