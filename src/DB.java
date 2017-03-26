
public class DB {
     String oldName;
    static DB database;
    public DB(String name){
        this.oldName=name;
    }
    public DB SetObject()
    {
        if(database==null)
        {
            database= new DB((oldName));
            System.out.println(oldName);
        }
        else
        {
            System.out.println(oldName);
        }
        return database;
    }
}
