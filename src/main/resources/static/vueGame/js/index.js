new Vue({
    el: '#root',
    data: {
        leftNumber: 0,
        topNumber: 0,
        n: 0
    },
    computed: {
        boxStyle() {
            return {
                'left': this.leftNumber + 'px',
                'top': this.topNumber + 'px'
            }
        },
    },
    watch: {
        n(newValue, oldValue) {
            this.n = parseInt(newValue)
        },
    }
})