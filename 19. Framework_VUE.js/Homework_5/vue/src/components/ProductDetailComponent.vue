<template>
    <div>
        <h2>Название продукта: {{ product.name }}</h2>
        <h2>Цена продукта: {{ formattedPrice }}</h2>
        <h2 v-if="product.available">Наличие продукта: Available</h2>
        <h2 v-else>Наличие продукта: Out Of Stock</h2>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                product: {
                    name: 'test',
                    price: 100,
                    available: true
                }
            }
        },
        computed: {
            formattedPrice() {
                return '$' + this.product.price.toFixed(2);
            }
        }

    }
</script>

<style lang="scss" scoped>

</style>