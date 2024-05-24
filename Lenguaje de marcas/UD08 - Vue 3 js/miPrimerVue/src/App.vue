<script setup>
    import { ref, computed } from 'vue';

    const nombre = "Marcos Remón";
    const contador = ref(0);
    const arrayFavoritos = ref([]);

    const incrementar = () => {
    contador.value++;
    };

    const decrementar = () => {
    contador.value--;
    };

    const resetear = () => {
    contador.value = 0;
    };

    const anadir = () => {
    arrayFavoritos.value.push( contador.value );
    };

    const claseContador = computed(() => {
    if ( contador.value === 0 ) return 'zero';
    return contador.value > 0 ? 'positive' : 'negative';
    });

    const bloquearBotonAdd = computed( ()=>{
    const numSearch = arrayFavoritos.value.find((num) => num === contador.value );
    return numSearch || numSearch === 0;
    });
</script>

<template>
<div class="container text-center mt-3">
    <h1>Contador {{ nombre }}</h1>
        <h2 :class="claseContador">{{ contador }}</h2>
        <div class="btn-group">
            <button @click="incrementar" class="btn btn-success">Incrementar</button>
            <button @click="decrementar" class="btn btn-danger">Decrementar</button>
            <button @click="resetear" class="btn btn-secondary">Resetear</button>
            <button @click="anadir" :disabled="bloquearBotonAdd" class="btn btn-primary">Añadir</button>
        </div>    
    <ul class="list-group mt-4">
        <li class="list-group-item" v-for="(num, index) in arrayFavoritos" :key="index">{{ num }}</li>
    </ul>
</div>
    
</template>
<style>
h1 {
    color: red;
}
.negative{
    color: red;
}
.positive{
    color: green;
}
.zero{
    color: peru;
}
</style>