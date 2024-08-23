public  class Task {
           private    long id ;
           private    String title;
          private     boolean status;
          
          //Le constructeur
          public Task(long id , String title){
               this.id=id;
               this.title=title;
               this.status=false;

               }
               public long getId() {
                              return this.id;
               }

               public void setId(long id) {
                              this.id = id;
               }

               public String gettitle() {
                              return this.title;
               }

               public void settitle(String title) {
                              this.title = title;
               }

               // public boolean isStatus() {
               //                return this.status;
               // }

               public String getStatus() {
                    return this.status ? "traité" : "Non traité";
               }

               public void setStatus(boolean status) {
                              this.status = status;
               }
}
