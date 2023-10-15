package com.spring.springV2cleanStructure.utilities;

import java.util.UUID;

public class PasswordGenerator {
//    if we dont need to database , we will not put @Componet(@Service ,@Controller or @RestController ,@Repository)

    // we will use static if the function return one static value
    public static String generate(){
        return UUID.randomUUID().toString();
    }
}
