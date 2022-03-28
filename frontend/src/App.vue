<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <button @click="test1">Get결과출력</button><br>
</template>

<script>

export default {
  name: 'App',
  components: {
  },
  methods: {
    test1() {
      console.log("111")
      console.log("222")
      const formData = new FormData()
      formData.append('email', '111')
      this.axios.get('/api/test', formData).then(res => {
        console.log(res.data)
      })
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
