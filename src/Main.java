import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        int age;
        HashMap<Integer,ArrayList<User>>listOfUsers=new HashMap<Integer,ArrayList<User>>();
        for(int i =0;i<5;i++) {
            System.out.println("Введите имя");
            name = scanner.nextLine();
            System.out.println("Введите возраст");
            age = scanner.nextInt();
            if(listOfUsers.containsKey(age))
            {
                var lists=listOfUsers.get(age);
                lists.add(new User(name,age));
                listOfUsers.put(age,lists);
            }
            else
            {
                var list= new ArrayList<User>();
                list.add(new User(name,age));
                listOfUsers.put(age,list);
            }
            scanner.nextLine();
        }

        var keySetOfHashMap=listOfUsers.keySet();
        System.out.println("Введиет необходимый возраст");
        int neobhodimVozrst;
        neobhodimVozrst=scanner.nextInt();
        for(Integer key: listOfUsers.keySet())
        {
            if(!listOfUsers.containsKey(neobhodimVozrst))
            {
                System.out.println("Пользователь с возрастом "+neobhodimVozrst+" не найден" );
                break;
            }
            if(key==neobhodimVozrst)
            {
                var list=listOfUsers.get(key);
                for(int i =0;i<list.size();i++)
                {
                    System.out.println(list.get(i).toString());
                }
            }
        }

    }
}


