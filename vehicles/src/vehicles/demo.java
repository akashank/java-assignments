/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author Ankit Akash
 */
public class demo {
    
    //To test our Vehicle interface

	public static void main(String[] args) {
		
		Vehicles v[]=new Vehicles[3];
		v[0]=new TwoWheeler();
		v[1]=new ThreeWheeler();
		v[2]=new FourWheeler();
		for(int i=0;i<v.length;i++)
		{
			if(v[i].getClass().getName()=="ThreeWheeler")
				v[i].start();
		}

	}

}
    

