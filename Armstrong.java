public class Armstrong {
    int n=153;
    int orig=n;
    int yy=orig;
    int count=0;
    int sum=0;
    while(n>0){
        int r=n%10;
        n=n/10;
        count+=1;
    }
    while(orig>0){
        int rr=orig%10;
        orig=orig/10;
        int power=1;
        for(int i=0;i<count;i++){
            power=power*rr;
        }
        sum+=power;
    }
    if(yy==sum){
        System.out.println("ArmStrong");
    }
    else{
        System.out.println("Not an Armstrong");
}
}

