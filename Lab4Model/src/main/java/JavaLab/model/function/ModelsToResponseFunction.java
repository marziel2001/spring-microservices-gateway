package JavaLab.model.function;

import JavaLab.model.dto.GetModelsResponse;
import JavaLab.model.entity.Model;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;

@Component
public class ModelsToResponseFunction implements Function<List<Model>, GetModelsResponse> {

    public GetModelsResponse apply(List<Model> entities) {
        return GetModelsResponse.builder()
            .models(entities.stream()
                .map(model -> GetModelsResponse.Model.builder()
                    .id(model.getUuid())
                    .name(model.getName())
                    .build())
                .toList())
            .build();
    }

}
