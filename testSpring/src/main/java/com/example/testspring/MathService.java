package com.example.testspring;


import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int sum(int a, int b){
        return a+b;
    }
}
