package com.github.leovd100.message.service.domainLayer.model;

import com.github.leovd100.message.service.domainLayer.enums.TypeMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private UUID id;
    private TypeMessage typeMessage;
    private String contactValue;

    public Message(Lead lead, TypeMessage typeMessage){
        this.id = lead.getId();
        this.typeMessage  = typeMessage;
        if(TypeMessage.SMS.equals(typeMessage)){
            this.contactValue = lead.getPhone();
        }else {
            this.contactValue = lead.getEmail();
        }
    }

}