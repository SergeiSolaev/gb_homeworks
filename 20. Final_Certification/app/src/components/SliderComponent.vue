<template>
  <swiper :style="{
    '--swiper-navigation-color': '#fff',
    '--swiper-pagination-color': '#fff',
  }" :zoom="true" :navigation="false" :pagination="{
        clickable: true,
      }" :modules="modules" class="mySwiper">
    <swiper-slide>
      <div class="swiper-zoom-container">
        <img class="swiper-border" :src="projectsStore[0].img_details_1"/>
      </div>
    </swiper-slide>
    <swiper-slide>
      <div class="swiper-zoom-container">
        <img class="swiper-border" :src="projectsStore[0].img_details_2"/>
      </div>
    </swiper-slide>
    <swiper-slide>
      <div class="swiper-zoom-container">
        <img class="swiper-border"  :src="projectsStore[0].img_details_3"/>
      </div>
    </swiper-slide>
  </swiper>
</template>
<script>
import {mapState} from 'vuex'
// Import Swiper Vue.js components
import { Swiper, SwiperSlide } from 'swiper/vue';

// Import Swiper styles
import 'swiper/css';

import 'swiper/css/zoom';
import 'swiper/css/navigation';
import 'swiper/css/pagination';

// import required modules
import { Zoom, Navigation, Pagination } from 'swiper/modules';

export default {
  components: {
    Swiper,
    SwiperSlide,
  },
  computed: {
            ...mapState(['projectsStore'])
        },
  setup() {
    return {
      modules: [Zoom, Navigation, Pagination],
    };
  },
};
</script>

<style lang="scss">

  .swiper {
    height: 90vh;
    padding-bottom: 50px;
    margin-bottom: 100px;
  }

  .swiper-border {
  border-radius: 70px;
  }

  .swiper-pagination {
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .swiper-pagination-bullet {  
    width: 15px;
    height: 15px;
  }

  .swiper-pagination-bullet-active {
    border: 2px solid rgb(95, 95, 95);
    width: 15px;
    height: 15px;
  }

</style>
