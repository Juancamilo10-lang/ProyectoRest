package com.JsonPlaceholder.questions.Post;

import com.JsonPlaceholder.models.Post.ResponseArrayPost;
import com.JsonPlaceholder.models.Post.ResponseModelPost;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;

public class ResponsePost implements Question<ResponseArrayPost> {
    @Override
    public ResponseArrayPost answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(ResponseArrayPost.class);
    }
    public static ResponsePost was(){
        return new ResponsePost();
    }
}
