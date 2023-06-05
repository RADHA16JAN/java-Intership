package SyntheticsGPTKQL;
import java.util.List;
public abstract class PromptBuilder  implements IPromptBuilder {

    public List<String> buildPrompts(List<String> tableschema, String userPrompt) {
        return null;
    }


    public abstract void ShowPrompts();

    public static void main(String[] args) {

    }


}
