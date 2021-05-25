package Bluetooth;

import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import java.io.IOException;
import java.sql.SQLOutput;

public class Pair_Device {

    public static void main(String[] args) throws IOException {

        LocalDevice device = LocalDevice.getLocalDevice();

        RemoteDevice[] remotedevices = device.getDiscoveryAgent().retrieveDevices(DiscoveryAgent.PREKNOWN);

        for(RemoteDevice d : remotedevices)
        {
            System.out.println("Device Name : "+d.getFriendlyName(false));
            System.out.println("Bluetooth Address : "+d.getBluetoothAddress());
        }

    }
}
