package com.example;

public class MyGradeController {

    private GradeDisplay display;

    public MyGradeController(GradeDisplay display){
        this.display = display;
    }

    public void onSubmit(){
        this.display.getScore();
    }
}
