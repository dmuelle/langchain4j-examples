import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.mistralai.MistralAiChatModel;
import dev.langchain4j.model.mistralai.MistralAiChatModelName;

public class MistralAiChatModelExamples {

    static class Simple_Prompt {

        public static void main(String[] args) {

            ChatLanguageModel model = MistralAiChatModel.builder()
                    .apiKey(System.getenv("MISTRAL_AI_API_KEY")) // Please use your own Mistral AI API key
                    .modelName(MistralAiChatModelName.MISTRAL_SMALL.toString())
                    .logRequests(true)
                    .logResponses(true)
                    .build();

            String joke = model.generate("Tell me a joke about Java");

            System.out.println(joke);
        }
    }
}
