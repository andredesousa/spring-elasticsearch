package app.entity;

import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "users")
public class User {

    @Id
    @NotNull
    public Integer id;

    @NotNull
    public String username;

    @NotNull
    public String email;
}
