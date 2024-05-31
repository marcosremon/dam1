package Ejercicio2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Estudios {
        private String localidad;
        private float tasa_graduacion;
        private float media_cursos_matriculados;
        private String tipo_estudio;
        private String estudio;
        private String sexo;
        private float tasa_abandono_inicial;
        private int alumnos_graduados;
        private int curso_academico;
        private int alumnos_graduados_en_tiempo;
        private float tasa_abandono;
        private int alumnos_interrumpen_estudios;
        private int alumnos_interrumpen_est_ano1;

        public Estudios() {
        }

        public Estudios(String localidad, float tasa_graduacion, float media_cursos_matriculados, String tipo_estudio, String estudio, String sexo, float tasa_abandono_inicial, int alumnos_graduados, int curso_academico, int alumnos_graduados_en_tiempo, float tasa_abandono, int alumnos_interrumpen_estudios, int alumnos_interrumpen_est_ano1) {
                this.localidad = localidad;
                this.tasa_graduacion = tasa_graduacion;
                this.media_cursos_matriculados = media_cursos_matriculados;
                this.tipo_estudio = tipo_estudio;
                this.estudio = estudio;
                this.sexo = sexo;
                this.tasa_abandono_inicial = tasa_abandono_inicial;
                this.alumnos_graduados = alumnos_graduados;
                this.curso_academico = curso_academico;
                this.alumnos_graduados_en_tiempo = alumnos_graduados_en_tiempo;
                this.tasa_abandono = tasa_abandono;
                this.alumnos_interrumpen_estudios = alumnos_interrumpen_estudios;
                this.alumnos_interrumpen_est_ano1 = alumnos_interrumpen_est_ano1;
        }

        public String getLocalidad() {
                return localidad;
        }

        public void setLocalidad(String localidad) {
                this.localidad = localidad;
        }

        public float getTasa_graduacion() {
                return tasa_graduacion;
        }

        public void setTasa_graduacion(float tasa_graduacion) {
                this.tasa_graduacion = tasa_graduacion;
        }

        public float getMedia_cursos_matriculados() {
                return media_cursos_matriculados;
        }

        public void setMedia_cursos_matriculados(float media_cursos_matriculados) {
                this.media_cursos_matriculados = media_cursos_matriculados;
        }

        public String getTipo_estudio() {
                return tipo_estudio;
        }

        public void setTipo_estudio(String tipo_estudio) {
                this.tipo_estudio = tipo_estudio;
        }

        public String getEstudio() {
                return estudio;
        }

        public void setEstudio(String estudio) {
                this.estudio = estudio;
        }

        public String getSexo() {
                return sexo;
        }

        public void setSexo(String sexo) {
                this.sexo = sexo;
        }

        public float getTasa_abandono_inicial() {
                return tasa_abandono_inicial;
        }

        public void setTasa_abandono_inicial(float tasa_abandono_inicial) {
                this.tasa_abandono_inicial = tasa_abandono_inicial;
        }

        public int getAlumnos_graduados() {
                return alumnos_graduados;
        }

        public void setAlumnos_graduados(int alumnos_graduados) {
                this.alumnos_graduados = alumnos_graduados;
        }

        public int getCurso_academico() {
                return curso_academico;
        }

        public void setCurso_academico(int curso_academico) {
                this.curso_academico = curso_academico;
        }

        public int getAlumnos_graduados_en_tiempo() {
                return alumnos_graduados_en_tiempo;
        }

        public void setAlumnos_graduados_en_tiempo(int alumnos_graduados_en_tiempo) {
                this.alumnos_graduados_en_tiempo = alumnos_graduados_en_tiempo;
        }

        public float getTasa_abandono() {
                return tasa_abandono;
        }

        public void setTasa_abandono(float tasa_abandono) {
                this.tasa_abandono = tasa_abandono;
        }

        public int getAlumnos_interrumpen_estudios() {
                return alumnos_interrumpen_estudios;
        }

        public void setAlumnos_interrumpen_estudios(int alumnos_interrumpen_estudios) {
                this.alumnos_interrumpen_estudios = alumnos_interrumpen_estudios;
        }

        public int getAlumnos_interrumpen_est_ano1() {
                return alumnos_interrumpen_est_ano1;
        }

        public void setAlumnos_interrumpen_est_ano1(int alumnos_interrumpen_est_ano1) {
                this.alumnos_interrumpen_est_ano1 = alumnos_interrumpen_est_ano1;
        }

        @Override
        public String toString() {
                return "Estudios{" +
                        "localidad='" + localidad + '\'' +
                        ", tasa_graduacion=" + tasa_graduacion +
                        ", media_cursos_matriculados=" + media_cursos_matriculados +
                        ", tipo_estudio='" + tipo_estudio + '\'' +
                        ", estudio='" + estudio + '\'' +
                        ", sexo='" + sexo + '\'' +
                        ", tasa_abandono_inicial=" + tasa_abandono_inicial +
                        ", alumnos_graduados=" + alumnos_graduados +
                        ", curso_academico=" + curso_academico +
                        ", alumnos_graduados_en_tiempo=" + alumnos_graduados_en_tiempo +
                        ", tasa_abandono=" + tasa_abandono +
                        ", alumnos_interrumpen_estudios=" + alumnos_interrumpen_estudios +
                        ", alumnos_interrumpen_est_ano1=" + alumnos_interrumpen_est_ano1 +
                        '}';
        }
}