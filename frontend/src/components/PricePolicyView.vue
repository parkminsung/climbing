<template>

    <v-data-table
        :headers="headers"
        :items="pricePolicy"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'PricePolicyView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            pricePolicy : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/pricePolicies'))

            temp.data._embedded.pricePolicies.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.pricePolicy = temp.data._embedded.pricePolicies;
        },
        methods: {
        }
    }
</script>

