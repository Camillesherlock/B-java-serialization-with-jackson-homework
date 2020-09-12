package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;

public class PersonSerializer extends StdSerializer<PersonVo> {
    protected PersonSerializer(){
        super(PersonVo.class);
    }

    @Override
    public void serialize(PersonVo personVo, JsonGenerator jgen,
                           SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        if(personVo.getAge()==null){
            jgen.writeNumberField("age",0);
        } else{
            jgen.writeNumberField("age",personVo.getAge());
        }
        if(personVo.getHobby()!=null){
            jgen.writeStringField("hobby",personVo.getHobby());
        }
        jgen.writeStringField("name",personVo.getName());
        jgen.writeStringField("id",personVo.getId());
    }
}
