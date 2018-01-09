package com.company.Service;

import com.company.Interface.State;
import com.company.Model.Context;

public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Mahasiswa Aktif");
        context.setState(this);
    }

    public String toString(){
        return "Mahasiswa Aktif";
    }
}
