<template>
  <div class="content">
    <div class="md-layout">
      <div
        class="md-layout-item md-medium-size-100 md-small-size-100 md-medium-33"
      >
        <md-card>
          <md-card-media-actions>
            <md-card-media>
            </md-card-media>
            <md-card-media>
            </md-card-media>
            <md-card-media>
              <img src="../../assets/img/cat.png" alt="Cover">
            </md-card-media>
            <md-card-media>
            </md-card-media>
            <md-card-media>
            </md-card-media>
          </md-card-media-actions>
          <span>800</span>  <!-- span과 div 차이 -->

          <div>조회수</div>

          <md-card-actions>
            <div>800</div>
          </md-card-actions>
          <md-card-actions>
            <md-button class="md-icon-button">
              <md-icon>thumb_up</md-icon>
            </md-button>&nbsp;
            &nbsp;

            <md-button class="md-icon-button">
              <md-icon>favorite</md-icon>
            </md-button>&nbsp;

            <md-button class="md-icon-button">
              <md-icon>share</md-icon>
            </md-button>&nbsp;
          </md-card-actions>
        </md-card>
        <md-card>
          <md-card-content>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Optio itaque ea, nostrum odio. Dolores, sed accusantium quasi non.
          </md-card-content>

          <md-card-actions>
            <md-button class="md-icon-button">
              <md-icon>favorite</md-icon>
            </md-button>

            <md-button class="md-icon-button">
              <md-icon>share</md-icon>
            </md-button>
          </md-card-actions>
        </md-card>
      </div>
    </div>
  </div>
</template>

<style>
 .md-card{
   width: 50px;
   margin: 4px;
   display: inline-block;
   vertical-align: top;
 }
</style>
<script>
import {
  ChartCard,
} from "@/components";

export default {
  components: {
  },
  data() {
    return {
      dailySalesChart: {
        data: {
          labels: ["M", "T", "W", "T", "F", "S", "S"],
          series: [[12, 17, 7, 17, 23, 18, 38]],
        },
        options: {
          lineSmooth: this.$Chartist.Interpolation.cardinal({
            tension: 0,
          }),
          low: 0,
          high: 50, // creative tim: we recommend you to set the high sa the biggest value + something for a better look
          chartPadding: {
            top: 0,
            right: 0,
            bottom: 0,
            left: 0,
          },
        },
      },
      dataCompletedTasksChart: {
        data: {
          labels: ["12am", "3pm", "6pm", "9pm", "12pm", "3am", "6am", "9am"],
          series: [[230, 750, 450, 300, 280, 240, 200, 190]],
        },

        options: {
          lineSmooth: this.$Chartist.Interpolation.cardinal({
            tension: 0,
          }),
          low: 0,
          high: 1000, // creative tim: we recommend you to set the high sa the biggest value + something for a better look
          chartPadding: {
            top: 0,
            right: 0,
            bottom: 0,
            left: 0,
          },
        },
      },
      emailsSubscriptionChart: {
        data: {
          labels: [
            "Ja",
            "Fe",
            "Ma",
            "Ap",
            "Mai",
            "Ju",
            "Jul",
            "Au",
            "Se",
            "Oc",
            "No",
            "De",
          ],
          series: [
            [542, 443, 320, 780, 553, 453, 326, 434, 568, 610, 756, 895],
          ],
        },
        options: {
          axisX: {
            showGrid: false,
          },
          low: 0,
          high: 1000,
          chartPadding: {
            top: 0,
            right: 5,
            bottom: 0,
            left: 0,
          },
        },
        responsiveOptions: [
          [
            "screen and (max-width: 640px)",
            {
              seriesBarDistance: 5,
              axisX: {
                labelInterpolationFnc: function (value) {
                  return value[0];
                },
              },
            },
          ],
        ],
      },
    };
  },
};
</script>
