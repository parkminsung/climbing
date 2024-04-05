<template>

    <v-data-table
        :headers="headers"
        :items="trainingRemine"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'TrainingRemineView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            trainingRemine : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/trainingRemines'))

            temp.data._embedded.trainingRemines.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.trainingRemine = temp.data._embedded.trainingRemines;
        },
        methods: {
        }
    }
</script>

