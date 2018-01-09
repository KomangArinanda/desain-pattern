package com.company;

import com.company.Model.Context;
import com.company.Model.Mahasiswa;
import com.company.Model.MataKuliah;
import com.company.Model.NilaiMahasiswa;
import com.company.Service.Service;
import com.company.Service.StartState;
import com.company.Service.StopState;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
        MataKuliah mataKuliah = new MataKuliah("Design Patter", "KM123", "alham");
        Service service = new Service();
        service.addMatakuliah(mataKuliah);
    }
}
