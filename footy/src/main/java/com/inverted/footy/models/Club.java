package com.inverted.footy.models;

import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Document(collection = "clubs")
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Club {

    @MongoId(FieldType.OBJECT_ID)
    private long Id;

    @Indexed
    private String clubName;

    @Indexed
    private String Nickname;

    @Indexed
    @Field(targetType = FieldType.STRING)

    private Date createdAt;

    private Date updatedAt;
}
