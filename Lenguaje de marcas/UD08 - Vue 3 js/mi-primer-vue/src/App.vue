<script setup>
	import { ref, computed } from 'vue';

    const nombre = "Marcos Remón"; 

	//voy a convertir el contador en una variable reactiva
    let contador = ref(0);

    const arrayFavoritos = ref([])

    const increment = () => {
		contador.value++;
        console.log("me diste click");
    };
	const disminuir = () => {
		contador.value--;
        console.log("me diste click");
    };
	const resetear = () => {
		contador.value = 0;
        console.log("me diste click");
    };
    //no dejamos añadir duplicados
    const anyadir = () => {
        if (!arrayFavoritos.value.includes(contador.value)) {
            arrayFavoritos.value.push(contador.value);
        }
    };
    const bloquearBotonAdd = computed( () =>{
        const numSearch = arrayFavoritos.value.find((num) => num === contador.value );
        return numSearch || numSearch === 0;
    });
	const claseContador = computed(() => {
		if (contador.value === 0) return "zero"
		return contador.value > 0 ? "positive" : "negative";
	});
</script>
<template>
    <div class="container text-center mt-3">
        <h1>Contador {{ nombre }}</h1>
	    <h2 :class="claseContador">{{ contador }}</h2>
        <div class="btn-group">
            <button @click="increment" class="btn btn-success">incrementar</button>
            <button @click="disminuir"class="btn btn-danger">disminuir</button>
            <button @click="resetear" class="btn btn-secondary">resetear</button>
            <button @click="anyadir" :disabled="bloquearBotonAdd" class="btn btn-primary">añadir</button>
            <!-- {{ arrayFavoritos }} -->
        </div>
        <ul class="list-group mt-4">
            <li v-for="(num, index) in arrayFavoritos" :key="index" class="list-group-item">{{ num }}</li>
        </ul>
    </div>
</template>