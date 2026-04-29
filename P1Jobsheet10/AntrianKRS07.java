package P1Jobsheet10;

public class AntrianKRS07 {
    Mahasiswa07[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahProses;

    public AntrianKRS07(int n) {
        max = n;
        data = new Mahasiswa07[max];
        front = rear = -1;
        size = 0;
        sudahProses = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void enqueue(Mahasiswa07 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh!");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }

            data[rear] = mhs;
            size++;

            System.out.println("Mahasiswa berhasil masuk antrian");
        }
    }

    public void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa!");
            return;
        }

        System.out.println("Mahasiswa dipanggil untuk proses KRS:");

        for (int i = 0; i < 2; i++) {
            Mahasiswa07 mhs = data[front];

            mhs.tampilData();
            System.out.println("-------------------");

            size--;
            sudahProses++;

            if (size == 0) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            int i = front;

            while (i != rear) {
                System.out.println(data[i].nim + " - " + data[i].nama);
                i = (i + 1) % max;
            }

            System.out.println(data[i].nim + " - " + data[i].nama);
        }
    }

    public void peekFront() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("2 Antrian Terdepan:");

            int i = front;
            int jumlah = Math.min(2, size);

            for (int j = 0; j < jumlah; j++) {
                data[i].tampilData();
                System.out.println("-------------------");

                i = (i + 1) % max;
            }
        }
    }

    public void peekRear() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling akhir:");
            data[rear].tampilData();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    public void jumlahSudahProses() {
        System.out.println("Jumlah mahasiswa sudah proses KRS: " + sudahProses);
    }

    public void belumProses() {
        int belum = 30 - sudahProses;
        System.out.println("Jumlah mahasiswa belum proses KRS: " + belum);
    }
}