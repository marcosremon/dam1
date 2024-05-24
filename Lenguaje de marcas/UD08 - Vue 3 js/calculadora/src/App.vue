<script setup>
    import { computed, ref } from 'vue';

    let contador = ref(0);
    let agregarNumeros = ref(0);
    let operacion = ref(0);
    let acumulado = ref(0);
    let resetear = ref(0);

    const resultado = computed(() => {
		if (contador.value === 0) return "zero"
		return contador.value > 0 ? "positive" : "negative";
	});
    
    const borrar = () => {
        contador.value = contador.value.toString();
        if (contador.value.length > 1) {
            contador.value = contador.value.slice(0, -1);
        } else contador.value = 0;
        contador.value = parseFloat(contador.value);
    };

    const borrarTodo = () => {
        contador.value = 0;
    };

    const sumar = () => {
        acumulado.value += contador.value;
        operacion.value = 'sumar';
        contador.value = 0;
    };

    const restar = () => {
        acumulado.value += contador.value;
        operacion.value = 'restar';
        contador.value = 0;
    };

    const multiplicar = () => {
        acumulado.value += contador.value;
        operacion.value = 'multiplicar';
        contador.value = 0;
    };

    const dividir = () => {
        acumulado.value += contador.value;
        operacion.value = 'dividir';
        contador.value = 0;
    };

    const operar = () => {
        if (operacion.value === 'sumar') {
          contador.value = acumulado.value + contador.value;
        } else if (operacion.value === 'restar') {
          contador.value = acumulado.value - contador.value;
        } else if (operacion.value === 'multiplicar') {
          contador.value = acumulado.value * contador.value;
        } else if (operacion.value === 'dividir') {
          contador.value = acumulado.value / contador.value;
        }
        acumulado.value = 0;
        operacion.value = null;
        resetear.value = 1;
    };

    const agregarNumero = (numero) => {
        if (resetear.value === 1) {
            contador.value = numero;
            resetear.value = 0;
        } else if (agregarNumeros.value === null) {
          contador.value = contador.value * 10 + numero;
        } else {
          contador.value = numero;
          agregarNumeros.value = null;
        }
    };
</script>

<template>
    <div class="container mt-3">
        <table class="table table-bordered">
            <tr>
                <td id="resultado" :class="resultado">{{ contador }}</td>
            </tr>
        </table>
        <table class="table">
            <tr>
                <td><button class="btn btn-danger" @click="borrarTodo">CE</button></td>
                <td><button class="btn btn-warning" @click="borrarTodo">C</button></td>
                <td><button class="btn btn-secondary" @click="borrar">←</button></td>
                <td><button class="btn btn-primary" @click="dividir">/</button></td>
            </tr>
            <tr>
                <td><button class="btn btn-light" @click="agregarNumero(7)">7</button></td>
                <td><button class="btn btn-light" @click="agregarNumero(8)">8</button></td>
                <td><button class="btn btn-light" @click="agregarNumero(9)">9</button></td>
                <td><button class="btn btn-primary" @click="multiplicar">X</button></td>
            </tr>
            <tr>
                <td><button class="btn btn-light" @click="agregarNumero(4)">4</button></td>
                <td><button class="btn btn-light" @click="agregarNumero(5)">5</button></td>
                <td><button class="btn btn-light" @click="agregarNumero(6)">6</button></td>
                <td><button class="btn btn-primary" @click="restar">-</button></td>
            </tr>
            <tr>
                <td><button class="btn btn-light" @click="agregarNumero(1)">1</button></td>
                <td><button class="btn btn-light" @click="agregarNumero(2)">2</button></td>
                <td><button class="btn btn-light" @click="agregarNumero(3)">3</button></td>
                <td><button class="btn btn-primary" @click="sumar">+</button></td>
            </tr>
            <tr>
                <td><button class="btn btn-light" @click="agregarNumero(0)">0</button></td>
                <td colspan="3"><button class="btn btn-success w-100" @click="operar">=</button></td>
            </tr>
        </table>
    </div>
</template>