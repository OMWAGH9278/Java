public class Practice {

    private double width;
    private double height;

    public Practice(){

    }
    public Practice(double width, double height){
        if(width<0){
            if(height<0){
                this.width = 0;
                this.height = 0;
            }
            else {
                this.width = 0;
            }
        }else if(height<0){
            this.height = 0;
        }else{
            this.width = width;
            this.height = height;
        }
    }

}
