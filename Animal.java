package ru.geekbrains.Lesson5;

public abstract class Animal {
    protected String name;
    protected String type;
    protected float runmax, jumpmax, swimmax;

    public Animal(String name, String type, float runmax, float jumpmax, float swimmax) {
        this.name = name;
        this.type = type;
        this.runmax = runmax;
        this.jumpmax = jumpmax;
        this.swimmax = swimmax;
}


    protected  String run (float m) {
        float result=m;
        if (this.runmax < m) result=this.runmax;
        return(this.type+" "+this.name+" пробежал "+result+"м из "+m+"м");
    }

    protected  String jump (float m) {
        float result=m;
        if (this.jumpmax < m) result=this.jumpmax;
        return(this.type+" "+this.name+" прыгнул "+ result +"м из "+m+"м");
    }

    protected  String swim (float m) {
        if ((this instanceof Bird) || (this instanceof Cat)) { //Можно было использовать "проверить на равно 0", но так прикольнее.
            return(this.type+" "+this.name+" не умеет плавать");
        }
        else {
        float result=m;
        if (this.swimmax < m) result=this.swimmax;
        return(this.type+" "+this.name+" проплыл "+ result +"м из "+m+"м");
    }
    }
}
