package com.example.ladm_u2_p2_andresh

class Hilo(p:MainActivity):Thread() {
    var puntero = p

    override fun run() {
        super.run()
        while(true){
            sleep(100)
                puntero.lienzo!!.animar()
        }
    }
}