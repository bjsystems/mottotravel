<template>
  <div>
    <md-card v-for="(item, index) in videoList" :key="index.video_id">
      <md-card-header style="margin-top: 0px; margin-left: 0px; margin-right: 0px;">
        <md-avatar>
          <img :src=item.profile_image_url alt="Avatar">
        </md-avatar>
        <div class="md-title" style="margin-top: 5px;">{{ item.create_name }}</div>
        <div class="md-subhead" style="white-space : nowrap; text-overflow: ellipsis; overflow : hidden;">{{ item.video_title }}</div>
      </md-card-header>
      <md-card-media>
        <img :src=item.thumbnail_url alt="People">
      </md-card-media>
      <md-card-actions md-alignment="left">
        업로드일 : 2022년 03월 29일 · 댓글 : 3000개 <br>
        조회수 21900회 · 좋아요 1000개
      </md-card-actions>
      <div class="card-expansion">
        <md-card>
          <md-card-expand>
            <md-card-actions md-alignment="space-between">
              <md-card-expand-trigger>
                <md-button class="md-icon-button">
                  <md-icon>keyboard_arrow_down</md-icon>
                </md-button>
              </md-card-expand-trigger>
            </md-card-actions>
            <md-card-expand-content>
              <md-card-content>
                동영상 설명
              </md-card-content>
            </md-card-expand-content>
          </md-card-expand>
        </md-card>
      </div>
      <md-card-actions>
        <md-button class="md-icon-button">
          <md-icon>thumb_up</md-icon>
        </md-button>
        <md-button class="md-icon-button" md-alignment="right">
          <md-icon>favorite</md-icon>
        </md-button>
        <md-button class="md-icon-button">
          <md-icon>share</md-icon>
        </md-button>
      </md-card-actions>
    </md-card>
  </div>
</template>

<script>
import videoList_json from "../../public/json_data/main_data.json"

export default {
  name: 'Layouts',
  data: function () {
    return {
      videoList: videoList_json
    }
  },
  methods: {
    sendMessage () {
      window.alert('Send a message...')
    },
    doACall () {
      window.alert('Calling someone...')
    }
  }
}
</script>

<style lang="scss" scoped>
.md-card {
  width: 400px;
  margin: 4px;
  display: inline-block;
  vertical-align: top;
}



.md-card-example {
  .md-subhead {
    .md-icon {
      $size: 16px;

      width: $size;
      min-width: $size;
      height: $size;
      font-size: $size !important;
    }
    span {
      vertical-align: middle;
    }
  }
  .card-reservation {
    margin-top: 8px;
    display: flex;
    align-items: center;
    justify-content: space-between;

    .md-icon {
      margin: 8px;
    }
  }

  .md-button-group {
    display: flex;

    .md-button {
      min-width: 60px;
      border-radius: 2px;
    }
  }
}
</style>