package com.alphacoder;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class HashMap {
    private int maxSize;
    private int currentSize;
    private int prime;
    private int a;
    private int b;
    private Entry [] bucket;

    public HashMap(){
        this.maxSize= 8;
        prime= getPrimeNumber(maxSize);
        a= ThreadLocalRandom.current().nextInt(1, prime+1);
        b= ThreadLocalRandom.current().nextInt(1, prime+1);
        bucket= new Entry[maxSize];

    }

    private int hash(int key){
        return (((a*key)+ b)%prime)%maxSize;
    }

    public void put(int key, int value){
        int temp= hash(key);
        int i= temp;

        do{
            if(bucket[i]== null){
                Entry entry= new Entry();
                entry.setValue(value);
                entry.setKey(key);
                bucket[i]= entry;
                currentSize++;
                resize();
                return;
            }
            if(bucket[i].isDeleted()){
                bucket[i].setKey(key);
                bucket[i].setValue(value);
                bucket[i].setDeleted(false);
                currentSize++;
                resize();
                return;
            }
            if(bucket[i].getKey()==key){
                bucket[i].setValue(value);
                return;
            }if(bucket[i].getKey()!= key){
                i= (i+1)%maxSize;
            }
        }while(i!= temp);
    }

    public boolean exists(int key){
        int temp= hash(key);
        int i= temp;

        do{
            if(bucket[i]!= null && !bucket[i].isDeleted() && bucket[i].getKey()== key){
                return true;
            }
            i=(i+1)%maxSize;
        }while(i!= temp);

        return false;
    }

    public int get(int key){
        int temp= hash(key);
        int i= temp;

        do{
            if(bucket[i]!= null && !bucket[i].isDeleted() && bucket[i].getKey()== key){
                return bucket[i].getValue();
            }
            i=(i+1)%maxSize;
        }while(i!= temp);

        return -1;
    }

    public void remove(int key){
        int temp= hash(key);
        int i= temp;

        do{
            if(bucket[i]!= null && bucket[i].getKey()==key &&
            !bucket[i].isDeleted()){
                bucket[i].setDeleted(true);
                return;
            }
            i=(i+1)%maxSize;
        }while(i!= temp);
    }

    private int getPrimeNumber(int num){
        if(num<=1){
            return 2;
        }
        boolean isFound= false;

        while(!isFound){
            num++;
            isFound= isPrime(num);
        }

        return num;
    }

    private boolean isPrime(int num){
        if(num<= 1){
            return false;
        }
        if(num <=3){
            return true;
        }

        if(num%2==0 || num%3==0){
            return false;
        }

        for(int i=5; i*i<num; i=i+6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }

        return true;
    }

    private void resize(){
        if((double) currentSize/ (double) maxSize > 0.5){
            this.maxSize= maxSize*2;
            int prime= getPrimeNumber(maxSize);
            this.a= ThreadLocalRandom.current().nextInt(1, prime+1);
            this.b= ThreadLocalRandom.current().nextInt(1, prime+1);

            Entry[] tempArr= new Entry[maxSize];

            for(int i= 0; i< bucket.length; i++){
                if(bucket[i]!= null && !bucket[i].isDeleted()){
                    int temp= hash(bucket[i].getKey()); //rehash
                    int j= temp;

                    do{
                        if(tempArr[j]== null){
                            tempArr[j]= bucket[i];
                            break;
                        }else{
                            j=(j+1)%maxSize;
                        }
                    }while(j!= temp);
                }
            }
            this.bucket= tempArr;
            tempArr= null;
        }
    }
}
