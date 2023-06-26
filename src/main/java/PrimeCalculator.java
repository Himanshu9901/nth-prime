class PrimeCalculator{

    int nth(int nth){
        if(nth==0){
            throw new IllegalArgumentException();
        }
        int count=1,primeNo=2,i=2;
        while(count<=nth){
            if(checkPrime(i)){
                primeNo = i;
                count++;
            }
            i++;
        }
        return primeNo;
    }
    boolean checkPrime(int n){
        int i =2;
        while(i<n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

}
