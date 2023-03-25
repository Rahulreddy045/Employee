public class Employee{
	int id ;
	String name;
	double sal;

	Employee(int id ,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
    }
        @Override
    public String toString(){
        return "id: "+id+" name: "+name+" sal: "+sal;
    }

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"aaa",1.2);
		Employee e2=new Employee(2,"bbb",1.3);
		Employee e3=new Employee(3,"ccc",1.4);

        Employee [] e=new Employee[3];
        e[0]=e1;
        e[1]=e2;
        e[2]=e3;


       for (int i=0;i<e.length;i++){
            System.out.println(e[i]);
            //System.out.println(e[i].id);
       }

		
	}
}