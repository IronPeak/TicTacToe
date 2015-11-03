game = {};

$(document).ready(function() {
  
  game.getBoard();

  $('.box').on('click', function(event) {
    game.updateBoard(this);
    game.getPlayer();
    game.isWinner();
  });

  $('#restart').on('click', function(event) {
    game.restart();
  });

});

game.getBoard = function() {
  $.ajax({
    type: 'get',
    url: '/getBoard'
    }).done(function(response) {
      game.setBoard(response);
      game.getPlayer();
    }).fail(function(err) {
  });
}

game.isWinner = function() {
  $.ajax({
    type: 'get',
    url: '/isWinner',
    data: null
    }).done(function(response) {
      if (response != '0') {
        game.displayWinner(response);
      };
    }).fail(function(err) {
  });
}

game.displayWinner = function(winner) {
  if (winner == "1") {
    $('#winner').text('Player 1 is the winner!');
  } else if (winner == "2") {
    $('#winner').text('Player 2 is the winner!');
  } else if (winner == "3") {
    $('#winner').text("It's a Tie!");
  };
  game.restart();
}

game.restart = function() {
  $.ajax({
    type: 'post',
    url: '/restart'
    }).done(function(response) {
      game.setBoard(response);
      game.getPlayer();
    }).fail(function(err) {
  });
}

game.updateBoard = function(box) {
  $('#winner').text('');
  var id = $(box).find('div').attr('id');
  var position = id.charAt(id.length - 1);

  $.ajax({
    type: 'post',
    url: '/setBox',
    data: {
      "position" : position
    }
    }).done(function(response) {
        game.setBoard(response);
    }).fail(function(err) {
  });
}

game.getPlayer = function() {
  $.ajax({
    type: 'get',
    url: '/getPlayer'
    }).done(function(response) {
        $('#player').text(response);
    }).fail(function(err) {
  });
}

game.setBoard = function(boardState) {
  $.each($('.box'), function(index) {
    $(this).find('div').removeClass('empty player-X player-O');
    switch(boardState.charAt(index)) {
      case '0':
        $(this).find('div').addClass('empty');
        break;
      case '1':
        $(this).find('div').addClass('player-X');
        break;
      case '2':
        $(this).find('div').addClass('player-O');
        break;
    }
  });
};
<<<<<<< Updated upstream
=======
  
>>>>>>> Stashed changes
