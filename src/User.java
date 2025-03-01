public class User {
    private String name;
    private Integer age;



    public User()
    {
        setName("no name");
        setAge(0);
    }

    public User(String namez,Integer agez)
    {
        setName(namez);
        setAge(agez);
    }
    public String toString() {
        String newString=name+" возраст "+age+" лет";
        return newString;
    }


    public String getName() {
        return  name;
    }

    public void setName (String namez)
    {
        name = namez;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer agez){age=agez;};

}
