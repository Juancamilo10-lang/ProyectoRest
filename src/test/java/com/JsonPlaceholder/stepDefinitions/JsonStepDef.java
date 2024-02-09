package com.JsonPlaceholder.stepDefinitions;


import com.JsonPlaceholder.questions.Post.ResponsePost;
import com.JsonPlaceholder.questions.ResponseServerCode;
import com.JsonPlaceholder.tasks.PostTask.GetManagmentPostTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class JsonStepDef {

    Actor admin = Actor.named("admin")
            .whoCan(CallAnApi.at("https://jsonplaceholder.typicode.com"));

    @When("i consume the posts endpoint")
    public void iConsumeThePostsEndpoint() {
        admin.attemptsTo(
                GetManagmentPostTask.getPost()
        );


    }
    @Then("you should see the available posts")
    public void youShouldSeeTheAvailablePosts() {
        admin.should(
                seeThat(
                        ResponseServerCode.was(),
                        equalTo(200)
                )

        );

    }
}
