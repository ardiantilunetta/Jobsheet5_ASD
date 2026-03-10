public class NilaiMahasiswa {
    int maxUTS(Mahasiswa arr[], int l, int r){
        if (l==r) {
            return arr[l].uts;
        }

        int mid = (l+r)/2;
        int lmax = maxUTS(arr, l, mid);
        int rmax = maxUTS(arr, mid+1, r);
        return Math.max(lmax,rmax);
    }

    int minUTS(Mahasiswa arr[], int l, int r){
        if(l == r){
            return arr[l].uts;
        }

        int mid = (l+r)/2;

        int lmin = minUTS(arr, l, mid);
        int rmin = minUTS(arr, mid+1, r);

        return Math.min(lmin, rmin);
    }

    double rataUAS(Mahasiswa arr[]){
        double total = 0;

        for(int i = 0; i < arr.length; i++){
            total += arr[i].uas;
        }

        return total / arr.length;
    }
}
