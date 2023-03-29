package com.restapi.server.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "serverPost")
public class server {
    @Id
    public String name;
    public String id;
    public String lang;
    public String framework;

     public String getName() {
        return name;
     }
     public void setName( String name) {
        this.name = name;
     }
     public String getId() {
        return id;
     }
     public void setId( String id) {
        this.id = id;
     }
     public String getLang() {
        return lang;
     }
     public void setLang( String lang) {
        this.lang =lang;
     }
     public String getFramework() {
        return framework;
     }
     public void setFramework( String framework) {
        this.framework = framework;
     }

   

}
