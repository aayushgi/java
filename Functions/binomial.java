public class binomial {
    public class factorial {
public static int fact(int n) {
    int f=1;

    for(int i=1; i<=n; i++){
        f=f*i;
    }
    return f;
}  

public static int bincoffe(int n, int r) {
    int fact_n=fact(n);
    int fact_r=fact(r);
    int fact_n_r=fact(n-r);

    int bincoffe= fact_n/(fact_r*fact_n_r);
    return bincoffe;
    
}
  public static void main(String[] args) {
    System.out.println(bincoffe(5,2));
  }
}


    
}


