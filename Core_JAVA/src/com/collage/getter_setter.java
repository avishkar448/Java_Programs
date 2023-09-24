package com.collage;
  class employ12{
      private int id;
      private String name;
      public String getName(){
          return name;
      }

      public void setName(String n) {
          this.name = n;
      }

      public void setId(int i) {
          this.id = i;
      }

      public int getId() {
          return id;
      }
  }
public class getter_setter {
    public static void main(String[] args) {
        employ12 emp1=new employ12();
        emp1.setId(1);
        emp1.setName("avishkar");
        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
    }
}
